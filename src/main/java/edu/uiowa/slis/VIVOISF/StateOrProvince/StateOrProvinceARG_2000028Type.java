package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceARG_2000028Iterator theStateOrProvinceARG_2000028Iterator = (StateOrProvinceARG_2000028Iterator)findAncestorWithClass(this, StateOrProvinceARG_2000028Iterator.class);
			pageContext.getOut().print(theStateOrProvinceARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

