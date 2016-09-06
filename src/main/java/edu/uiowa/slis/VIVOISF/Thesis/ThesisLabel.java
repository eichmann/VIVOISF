package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			if (!theThesis.commitNeeded) {
				pageContext.getOut().print(theThesis.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			return theThesis.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thesis for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			theThesis.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for label tag ");
		}
	}
}

