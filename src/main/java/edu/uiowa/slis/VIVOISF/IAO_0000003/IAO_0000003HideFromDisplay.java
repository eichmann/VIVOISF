package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			if (!theIAO_0000003.commitNeeded) {
				pageContext.getOut().print(theIAO_0000003.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			return theIAO_0000003.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing IAO_0000003 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			IAO_0000003 theIAO_0000003 = (IAO_0000003)findAncestorWithClass(this, IAO_0000003.class);
			theIAO_0000003.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for hideFromDisplay tag ");
		}
	}
}

