package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NameLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			if (!theName.commitNeeded) {
				pageContext.getOut().print(theName.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Name for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			return theName.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Name for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Name theName = (Name)findAncestorWithClass(this, Name.class);
			theName.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Name for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for label tag ");
		}
	}
}

