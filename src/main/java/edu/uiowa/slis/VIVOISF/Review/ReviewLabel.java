package edu.uiowa.slis.VIVOISF.Review;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReviewLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReviewLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ReviewLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			if (!theReview.commitNeeded) {
				pageContext.getOut().print(theReview.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Review for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			return theReview.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Review for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Review theReview = (Review)findAncestorWithClass(this, Review.class);
			theReview.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Review for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Review for label tag ");
		}
	}
}

