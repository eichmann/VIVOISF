package edu.uiowa.slis.VIVOISF.PopulatedPlace;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PopulatedPlaceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PopulatedPlaceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PopulatedPlaceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			if (!thePopulatedPlace.commitNeeded) {
				pageContext.getOut().print(thePopulatedPlace.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			return thePopulatedPlace.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PopulatedPlace for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PopulatedPlace thePopulatedPlace = (PopulatedPlace)findAncestorWithClass(this, PopulatedPlace.class);
			thePopulatedPlace.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PopulatedPlace for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PopulatedPlace for subjectURI tag ");
		}
	}
}

