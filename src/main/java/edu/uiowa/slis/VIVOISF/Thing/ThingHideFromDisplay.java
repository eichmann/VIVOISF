package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			if (!theThing.commitNeeded) {
				pageContext.getOut().print(theThing.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			return theThing.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thing for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			theThing.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for hideFromDisplay tag ");
		}
	}
}

