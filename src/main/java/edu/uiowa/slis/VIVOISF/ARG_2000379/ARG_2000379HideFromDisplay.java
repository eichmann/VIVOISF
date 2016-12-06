package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379 theARG_2000379 = (ARG_2000379)findAncestorWithClass(this, ARG_2000379.class);
			if (!theARG_2000379.commitNeeded) {
				pageContext.getOut().print(theARG_2000379.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			ARG_2000379 theARG_2000379 = (ARG_2000379)findAncestorWithClass(this, ARG_2000379.class);
			return theARG_2000379.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing ARG_2000379 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			ARG_2000379 theARG_2000379 = (ARG_2000379)findAncestorWithClass(this, ARG_2000379.class);
			theARG_2000379.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for hideFromDisplay tag ");
		}
	}
}

