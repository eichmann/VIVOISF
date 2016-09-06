package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			if (!theStateOrProvince.commitNeeded) {
				pageContext.getOut().print(theStateOrProvince.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			return theStateOrProvince.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing StateOrProvince for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			StateOrProvince theStateOrProvince = (StateOrProvince)findAncestorWithClass(this, StateOrProvince.class);
			theStateOrProvince.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for label tag ");
		}
	}
}

