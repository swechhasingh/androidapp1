package com.acadplnr;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TimeTable extends Activity {

	class ascend {
		long starthr, endhr, startmin, endmin;
	}

	TextView tvMonC, tvMonT, tvTusC, tvTusT, tvWedC, tvWedT, tvThurC, tvThurT,
			tvFriC, tvFriT, tvSatC, tvSatT, tvSunC, tvSunT;
	String  courseascmon[] = {}, smont = "",
			stuet = "", swedt = "", sthut = "", sfrit = "", ssatt = "",
			ssunt = "", smonc = "", stuec = "", swedc = "", sthuc = "",
			sfric = "", ssatc = "", ssunc = "", courseasctue[] = {},
			courseascwed[] = {}, courseascthu[] = {}, courseascfri[] = {},
			courseascsat[] = {}, courseascsun[] = {}, timeascmon[] = {},
			timeasctue[] = {}, timeascwed[] = {}, timeascthu[] = {},
			timeascfri[] = {}, timeascsat[] = {}, timeascsun[] = {};
	ascend mon[], tue[], wed[], thu[], fri[], sat[], sun[];
	int a=0,b=0,c=0,d=0,e=0,f=0,g=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.time_table);
		tvMonC = (TextView) findViewById(R.id.tvMonC);
		tvTusC = (TextView) findViewById(R.id.tvTusC);
		tvWedC = (TextView) findViewById(R.id.tvWedC);
		tvThurC = (TextView) findViewById(R.id.tvThurC);
		tvFriC = (TextView) findViewById(R.id.tvFriC);
		tvSatC = (TextView) findViewById(R.id.tvSatC);
		tvSunC = (TextView) findViewById(R.id.tvSunC);
		tvMonT = (TextView) findViewById(R.id.tvMonT);
		tvTusT = (TextView) findViewById(R.id.tvTusT);
		tvWedT = (TextView) findViewById(R.id.tvWedT);
		tvThurT = (TextView) findViewById(R.id.tvThurT);
		tvFriT = (TextView) findViewById(R.id.tvFriT);
		tvSatT = (TextView) findViewById(R.id.tvSatT);
		tvSunT = (TextView) findViewById(R.id.tvSunT);

		Crs_database_help info = new Crs_database_help(this);
		info.open();
		try {
			int count = info.getCount();
			for (int j = 0; j < count; j++) {
				String detail = info.GetCourseDetailById(j + 1);
				String data[] = detail.split("-");
				String[] lec_days = data[4].split(" ");
				String[] lab_days = data[7].split(" ");
				String[] tut_days = data[10].split(" ");

				for (int i = 0; i < lec_days.length; i++) {
					if (lec_days[i].contentEquals("M")) {
						courseascmon[a] = data[0] + "(lec)";
						timeascmon[a] = data[5] + " to " + data[6];
						a++;
					}
					if (lec_days[i].contentEquals("T")) {
						courseasctue[b] = data[0] + "(lec)";
						timeasctue[b] = data[5] + " to " + data[6];
						b++;
					}
					if (lec_days[i].contentEquals("W")) {
						courseascwed[c] = data[0] + "(lec)";
						timeascwed[c] = data[5] + " to " + data[6];
						c++;
					}
					if (lec_days[i].contentEquals("t")) {
						courseascthu[d] = data[0] + "(lec)";
						timeascthu[d] = data[5] + " to " + data[6];
						d++;
					}
					if (lec_days[i].contentEquals("F")) {
						courseascfri[e] = data[0] + "(lec)";
						timeascfri[e] = data[5] + " to " + data[6];
						e++;
					}
					if (lec_days[i].contentEquals("S")) {
						courseascsat[f] = data[0] + "(lec)";
						timeascsat[f] = data[5] + " to " + data[6];
						f++;
					}
					if (lec_days[i].contentEquals("s")) {
						courseascsun[g] = data[0] + "(lec)";
						timeascsun[g] = data[5] + " to " + data[6];
						g++;
					}
				}
				for (int i = 0; i < lab_days.length; i++) {
					if (lab_days[i].contentEquals("M")) {
						courseascmon[a] = data[0] + "(lec)";
						timeascmon[a] = data[5] + " to " + data[6];
						a++;
					}
					if (lab_days[i].contentEquals("T")) {
						courseasctue[b] = data[0] + "(lec)";
						timeasctue[b] = data[5] + " to " + data[6];
						b++;
					}
					if (lab_days[i].contentEquals("W")) {
						courseascwed[c] = data[0] + "(lec)";
						timeascwed[c] = data[5] + " to " + data[6];
						c++;
					}
					if (lab_days[i].contentEquals("t")) {
						courseascthu[d] = data[0] + "(lec)";
						timeascthu[d] = data[5] + " to " + data[6];
						d++;
					}
					if (lab_days[i].contentEquals("F")) {
						courseascfri[e] = data[0] + "(lec)";
						timeascfri[e] = data[5] + " to " + data[6];
						e++;
					}
					if (lab_days[i].contentEquals("S")) {
						courseascsat[f] = data[0] + "(lec)";
						timeascsat[f] = data[5] + " to " + data[6];
						f++;
					}
					if (lab_days[i].contentEquals("s")) {
						courseascsun[g] = data[0] + "(lec)";
						timeascsun[g] = data[5] + " to " + data[6];
						g++;

					}
				}
				for (int i = 0; i < tut_days.length; i++) {
					if (tut_days[i].contentEquals("M")) {
						courseascmon[a] = data[0] + "(lec)";
						timeascmon[a] = data[5] + " to " + data[6];
						a++;
					}
					if (tut_days[i].contentEquals("T")) {
						courseasctue[b] = data[0] + "(lec)";
						timeasctue[b] = data[5] + " to " + data[6];
						b++;
					}
					if (tut_days[i].contentEquals("W")) {
						courseascwed[c] = data[0] + "(lec)";
						timeascwed[c] = data[5] + " to " + data[6];
						c++;
					}
					if (tut_days[i].contentEquals("t")) {
						courseascthu[d] = data[0] + "(lec)";
						timeascthu[d] = data[5] + " to " + data[6];
						d++;
					}
					if (tut_days[i].contentEquals("F")) {
						courseascfri[e] = data[0] + "(lec)";
						timeascfri[e] = data[5] + " to " + data[6];
						e++;
					}
					if (tut_days[i].contentEquals("S")) { 
						courseascsat[f] = data[0] + "(lec)";
						timeascsat[f] = data[5] + " to " + data[6];
						f++;
					}
					if (tut_days[i].contentEquals("s")) {
						courseascsun[g] = data[0] + "(lec)";
						timeascsun[g] = data[5] + " to " + data[6];
						g++;
					}

				}

			}
		} catch (Exception e) {

		}

		for (int k = 0; k < timeascmon.length; k++) {

			String[] sep = timeascmon[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			mon[k].starthr = Long.parseLong(septimestart[0]);
			mon[k].startmin = Long.parseLong(septimestart[1]);
			mon[k].endhr = Long.parseLong(septimeend[0]);
			mon[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeasctue.length; k++) {

			String[] sep = timeasctue[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			tue[k].starthr = Long.parseLong(septimestart[0]);
			tue[k].startmin = Long.parseLong(septimestart[1]);
			tue[k].endhr = Long.parseLong(septimeend[0]);
			tue[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeascwed.length; k++) {

			String[] sep = timeascwed[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			wed[k].starthr = Long.parseLong(septimestart[0]);
			wed[k].startmin = Long.parseLong(septimestart[1]);
			wed[k].endhr = Long.parseLong(septimeend[0]);
			wed[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeascthu.length; k++) {

			String[] sep = timeascthu[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			thu[k].starthr = Long.parseLong(septimestart[0]);
			thu[k].startmin = Long.parseLong(septimestart[1]);
			thu[k].endhr = Long.parseLong(septimeend[0]);
			thu[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeascfri.length; k++) {

			String[] sep = timeascfri[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			fri[k].starthr = Long.parseLong(septimestart[0]);
			fri[k].startmin = Long.parseLong(septimestart[1]);
			fri[k].endhr = Long.parseLong(septimeend[0]);
			fri[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeascsat.length; k++) {

			String[] sep = timeascsat[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			sat[k].starthr = Long.parseLong(septimestart[0]);
			sat[k].startmin = Long.parseLong(septimestart[1]);
			sat[k].endhr = Long.parseLong(septimeend[0]);
			sat[k].endmin = Long.parseLong(septimeend[1]);

		}
		for (int k = 0; k < timeascsun.length; k++) {

			String[] sep = timeascsun[k].split(" to ");
			String[] septimestart = sep[0].split(":");
			String[] septimeend = sep[1].split(":");

			sun[k].starthr = Long.parseLong(septimestart[0]);
			sun[k].startmin = Long.parseLong(septimestart[1]);
			sun[k].endhr = Long.parseLong(septimeend[0]);
			sun[k].endmin = Long.parseLong(septimeend[1]);

		}

		for (int k = 0; k < timeascmon.length; k++) {

			int j = k + 1;
			ascend temp = mon[j];
			long temphr = mon[j].starthr;
			long tempmin = mon[j].startmin;
			String time = timeascmon[j];
			String course = courseascmon[j];
			while (j > 0
					&& ((temphr < mon[j - 1].starthr) || ((temphr == mon[j - 1].starthr) && (tempmin < mon[j - 1].startmin)))) {

				timeascmon[j] = timeascmon[j - 1];
				courseascmon[j] = courseascmon[j - 1];
				mon[j] = mon[j-1];
				j--;

			}
			timeascmon[j] = time;
			courseascmon[j] = course;
			mon[j] = temp;
		}

		for (int k = 0; k < timeasctue.length; k++) {

			int j = k + 1;
			ascend temp = tue[j];
			long temphr = tue[j].starthr;
			long tempmin = tue[j].startmin;
			String time = timeasctue[j];
			String course = courseasctue[j];
			while (j > 0
					&& ((temphr < tue[j - 1].starthr) || ((temphr == tue[j - 1].starthr) && (tempmin < tue[j - 1].startmin)))) {

				timeasctue[j] = timeasctue[j - 1];
				courseasctue[j] = courseasctue[j - 1];
				tue[j] = tue[j-1];
				j--;

			}
			timeasctue[j] = time;
			courseasctue[j] = course;
			tue[j] = temp;
		}

		for (int k = 0; k < timeascwed.length; k++) {

			int j = k + 1;
			ascend temp = wed[j];
			long temphr = wed[j].starthr;
			long tempmin = wed[j].startmin;
			String time = timeascwed[j];
			String course = courseascwed[j];
			while (j > 0
					&& ((temphr < wed[j - 1].starthr) || ((temphr == wed[j - 1].starthr) && (tempmin < wed[j - 1].startmin)))) {

				timeascwed[j] = timeascwed[j - 1];
				courseascwed[j] = courseascwed[j - 1];
				wed[j] = wed[j-1];
				j--;

			}
			timeascwed[j] = time;
			courseascwed[j] = course;
			wed[j] = temp;
		}

		for (int k = 0; k < timeascthu.length; k++) {

			int j = k + 1;
			ascend temp = thu[j];
			long temphr = thu[j].starthr;
			long tempmin = thu[j].startmin;
			String time = timeascthu[j];
			String course = courseascthu[j];
			while (j > 0
					&& ((temphr < thu[j - 1].starthr) || ((temphr == thu[j - 1].starthr) && (tempmin < thu[j - 1].startmin)))) {

				timeascthu[j] = timeascthu[j - 1];
				courseascmon[j] = courseascthu[j - 1];
				thu[j] = thu[j-1];
				j--;

			}
			timeascthu[j] = time;
			courseascthu[j] = course;
			thu[j]=temp;
		}

		for (int k = 0; k < timeascfri.length; k++) {

			int j = k + 1;
			ascend temp = fri[j];
			long temphr = fri[j].starthr;
			long tempmin = fri[j].startmin;
			String time = timeascfri[j];
			String course = courseascfri[j];
			while (j > 0
					&& ((temphr < fri[j - 1].starthr) || ((temphr == fri[j - 1].starthr) && (tempmin < fri[j - 1].startmin)))) {

				timeascfri[j] = timeascfri[j - 1];
				courseascfri[j] = courseascfri[j - 1];
				fri[j] = fri[j-1];
				j--;

			}
			timeascfri[j] = time;
			courseascfri[j] = course;
			fri[j]=temp;
		}
		

		for (int k = 0; k < timeascsat.length; k++) {

			int j = k + 1;
			ascend temp = sat[j];
			long temphr = sat[j].starthr;
			long tempmin = sat[j].startmin;
			String time = timeascsat[j];
			String course = courseascsat[j];
			while (j > 0
					&& ((temphr < sat[j - 1].starthr) || ((temphr == sat[j - 1].starthr) && (tempmin < sat[j - 1].startmin)))) {

				timeascsat[j] = timeascsat[j - 1];
				courseascsat[j] = courseascsat[j - 1];
				sat[j] = sat[j-1];
				j--;

			}
			timeascsat[j] = time;
			courseascsat[j] = course;
			sat[j]=temp;
		}

		for (int k = 0; k < timeascsun.length; k++) {

			int j = k + 1;
			ascend temp = sun[j];
			long temphr = sun[j].starthr;
			long tempmin = sun[j].startmin;
			String time = timeascsun[j];
			String course = courseascsun[j];
			while (j > 0
					&& ((temphr < sun[j - 1].starthr) || ((temphr == sun[j - 1].starthr) && (tempmin < sun[j - 1].startmin)))) {

				timeascsun[j] = timeascsun[j - 1];
				courseascsun[j] = courseascsun[j - 1];
				sun[j]=sun[j-1];
				j--;

			}
			timeascsun[j] = time;
			courseascsun[j] = course;
			sun[j]=temp;
		}

		for (int t = 0; t < timeascmon.length; t++) {

			smont = smont + timeascmon[t] + "\n";
			smonc = smonc + courseascmon[t] + "\n";
		}

		for (int t = 0; t < timeasctue.length; t++) {

			stuet = stuet + timeasctue[t] + "\n";
			stuec = stuec + courseasctue[t] + "\n";
		}
		for (int t = 0; t < timeascwed.length; t++) {

			swedt = swedt + timeascwed[t] + "\n";
			swedc = swedc + courseascwed[t] + "\n";
		}
		for (int t = 0; t < timeascthu.length; t++) {

			sthut = sthut + timeascthu[t] + "\n";
			sthuc = sthuc + courseascthu[t] + "\n";
		}
		for (int t = 0; t < timeascfri.length; t++) {

			sfrit = sfrit + timeascfri[t] + "\n";
			sfric = sfric + courseascfri[t] + "\n";
		}
		for (int t = 0; t < timeascsat.length; t++) {

			ssatt = ssatt + timeascsat[t] + "\n";
			ssatc = ssatc + courseascsat[t] + "\n";
		}
		for (int t = 0; t < timeascsun.length; t++) {

			ssunt = ssunt + timeascsun[t] + "\n";
			ssunc = ssunc + courseascsun[t] + "\n";
		}

		
		 tvMonC.setText(smonc); tvMonT.setText(smont);
		 tvTusC.setText(stuec); tvTusT.setText(stuet);
		 tvWedC.setText(swedc); tvWedT.setText(swedt);
		 tvThurC.setText(sthuc); tvThurT.setText(sthut);
		 tvFriC.setText(sfric); tvFriT.setText(sfrit);
		 tvSatC.setText(ssatc); tvSatT.setText(ssatt);
		 tvSunC.setText(ssunc); tvSunT.setText(ssunt);
		

	}
}