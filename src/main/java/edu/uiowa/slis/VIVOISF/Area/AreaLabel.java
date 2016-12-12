package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			if (!theArea.commitNeeded) {
				pageContext.getOut().print(theArea.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			return theArea.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Area theArea = (Area)findAncestorWithClass(this, Area.class);
			theArea.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Area for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for label tag ");
		}
	}
}

