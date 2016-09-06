package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			if (!theReferenceSource.commitNeeded) {
				pageContext.getOut().print(theReferenceSource.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			return theReferenceSource.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ReferenceSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ReferenceSource theReferenceSource = (ReferenceSource)findAncestorWithClass(this, ReferenceSource.class);
			theReferenceSource.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for label tag ");
		}
	}
}

