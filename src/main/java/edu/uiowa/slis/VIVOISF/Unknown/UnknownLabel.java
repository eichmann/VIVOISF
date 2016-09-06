package edu.uiowa.slis.VIVOISF.Unknown;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UnknownLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UnknownLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(UnknownLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			if (!theUnknown.commitNeeded) {
				pageContext.getOut().print(theUnknown.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Unknown for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			return theUnknown.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Unknown for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Unknown theUnknown = (Unknown)findAncestorWithClass(this, Unknown.class);
			theUnknown.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Unknown for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Unknown for label tag ");
		}
	}
}

