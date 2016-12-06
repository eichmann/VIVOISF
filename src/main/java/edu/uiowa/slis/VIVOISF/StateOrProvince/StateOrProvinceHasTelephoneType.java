package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceHasTelephoneIterator theStateOrProvinceHasTelephoneIterator = (StateOrProvinceHasTelephoneIterator)findAncestorWithClass(this, StateOrProvinceHasTelephoneIterator.class);
			pageContext.getOut().print(theStateOrProvinceHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

