package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			if (!theIAO_0000009.commitNeeded) {
				pageContext.getOut().print(theIAO_0000009.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			return theIAO_0000009.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000009 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			IAO_0000009 theIAO_0000009 = (IAO_0000009)findAncestorWithClass(this, IAO_0000009.class);
			theIAO_0000009.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hideFromDisplay tag ");
		}
	}
}

