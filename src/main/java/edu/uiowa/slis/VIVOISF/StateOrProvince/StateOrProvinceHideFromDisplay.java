package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			if (!theStateOrProvince.commitNeeded) {
				pageContext.getOut().print(theStateOrProvince.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			return theStateOrProvince.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing StateOrProvince for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			theStateOrProvince.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hideFromDisplay tag ");
		}
	}
}

