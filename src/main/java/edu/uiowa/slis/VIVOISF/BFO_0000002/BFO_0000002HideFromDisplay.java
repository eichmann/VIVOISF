package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002HideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002HideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002HideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002 theBFO_0000002 = (BFO_0000002)findAncestorWithClass(this, BFO_0000002.class);
			if (!theBFO_0000002.commitNeeded) {
				pageContext.getOut().print(theBFO_0000002.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			BFO_0000002 theBFO_0000002 = (BFO_0000002)findAncestorWithClass(this, BFO_0000002.class);
			return theBFO_0000002.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000002 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			BFO_0000002 theBFO_0000002 = (BFO_0000002)findAncestorWithClass(this, BFO_0000002.class);
			theBFO_0000002.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hideFromDisplay tag ");
		}
	}
}

