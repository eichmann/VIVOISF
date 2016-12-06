package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004 theBFO_0000004 = (BFO_0000004)findAncestorWithClass(this, BFO_0000004.class);
			if (!theBFO_0000004.commitNeeded) {
				pageContext.getOut().print(theBFO_0000004.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			BFO_0000004 theBFO_0000004 = (BFO_0000004)findAncestorWithClass(this, BFO_0000004.class);
			return theBFO_0000004.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000004 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			BFO_0000004 theBFO_0000004 = (BFO_0000004)findAncestorWithClass(this, BFO_0000004.class);
			theBFO_0000004.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hideFromDisplay tag ");
		}
	}
}

