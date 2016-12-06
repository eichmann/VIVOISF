package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceRelatesIterator theStateOrProvinceRelatesIterator = (StateOrProvinceRelatesIterator)findAncestorWithClass(this, StateOrProvinceRelatesIterator.class);
			pageContext.getOut().print(theStateOrProvinceRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for relates tag ");
		}
		return SKIP_BODY;
	}
}

