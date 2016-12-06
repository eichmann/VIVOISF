package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			if (!theterritory.commitNeeded) {
				pageContext.getOut().print(theterritory.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			return theterritory.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing territory for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			territory theterritory = (territory)findAncestorWithClass(this, territory.class);
			theterritory.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hideFromDisplay tag ");
		}
	}
}

