package edu.uiowa.slis.VIVOISF.StateOrProvince;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StateOrProvinceCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StateOrProvinceCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(StateOrProvinceCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StateOrProvinceCodeDBPediaIDIterator theStateOrProvince = (StateOrProvinceCodeDBPediaIDIterator)findAncestorWithClass(this, StateOrProvinceCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theStateOrProvince.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing StateOrProvince for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing StateOrProvince for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

