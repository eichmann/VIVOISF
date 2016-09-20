package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeInterval.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DateTimeIntervalIterator theDateTimeIntervalIterator = (DateTimeIntervalIterator) findAncestorWithClass(this, DateTimeIntervalIterator.class);

			if (theDateTimeIntervalIterator != null) {
				subjectURI = theDateTimeIntervalIterator.getSubjectURI();
				label = theDateTimeIntervalIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Conference.ConferenceDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Conference.ConferenceDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionDateTimeIntervalIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionDateTimeIntervalIterator)this.getParent()).getDateTimeInterval();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueEndInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueEndInverseIterator)this.getParent()).getEndInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueStartInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DateTimeValue.DateTimeValueStartInverseIterator)this.getParent()).getStartInverse();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionDateTimeIntervalIterator theFacultyPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && theFacultyPositionDateTimeIntervalIterator != null) {
				subjectURI = theFacultyPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionDateTimeIntervalIterator theLibrarianPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && theLibrarianPositionDateTimeIntervalIterator != null) {
				subjectURI = theLibrarianPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionDateTimeIntervalIterator theNonAcademicPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && theNonAcademicPositionDateTimeIntervalIterator != null) {
				subjectURI = theNonAcademicPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionDateTimeIntervalIterator thePositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.Position.PositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionDateTimeIntervalIterator.class);

			if (subjectURI == null && thePositionDateTimeIntervalIterator != null) {
				subjectURI = thePositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionDateTimeIntervalIterator theFacultyAdministrativePositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionDateTimeIntervalIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionDateTimeIntervalIterator != null) {
				subjectURI = theFacultyAdministrativePositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionDateTimeIntervalIterator theNonFacultyAcademicPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && theNonFacultyAcademicPositionDateTimeIntervalIterator != null) {
				subjectURI = theNonFacultyAcademicPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.Conference.ConferenceDateTimeIntervalIterator theConferenceDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.Conference.ConferenceDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Conference.ConferenceDateTimeIntervalIterator.class);

			if (subjectURI == null && theConferenceDateTimeIntervalIterator != null) {
				subjectURI = theConferenceDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionDateTimeIntervalIterator thePrimaryPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && thePrimaryPositionDateTimeIntervalIterator != null) {
				subjectURI = thePrimaryPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionDateTimeIntervalIterator thePostdocPositionDateTimeIntervalIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionDateTimeIntervalIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionDateTimeIntervalIterator.class);

			if (subjectURI == null && thePostdocPositionDateTimeIntervalIterator != null) {
				subjectURI = thePostdocPositionDateTimeIntervalIterator.getDateTimeInterval();
			}

			if (theDateTimeIntervalIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in DateTimeInterval doStartTag", e);
			throw new JspTagException("Exception raised in DateTimeInterval doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in DateTimeInterval doEndTag", e);
			throw new JspTagException("Exception raised in DateTimeInterval doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
