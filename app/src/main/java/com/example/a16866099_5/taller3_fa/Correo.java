package com.example.a16866099_5.taller3_fa;

public class Correo {
        String subject;
        String to;
        String from;
        String body;

        public Correo(String subject, String to, String from, String body) {
            this.subject = subject;
            this.to = to;
            this.from = from;
            this.body = body;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }


}
