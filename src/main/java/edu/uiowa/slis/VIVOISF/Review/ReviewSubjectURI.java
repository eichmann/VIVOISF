package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			if (!theReview.commitNeeded) {
				pageContext.getOut().print(theReview.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Review for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			return theReview.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Review for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			theReview.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Review for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for subjectURI tag ");
		}
	}
}

