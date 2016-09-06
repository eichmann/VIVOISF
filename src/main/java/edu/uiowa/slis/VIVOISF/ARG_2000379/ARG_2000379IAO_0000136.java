package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379IAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379IAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379IAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379IAO_0000136Iterator theARG_2000379IAO_0000136Iterator = (ARG_2000379IAO_0000136Iterator)findAncestorWithClass(this, ARG_2000379IAO_0000136Iterator.class);
			pageContext.getOut().print(theARG_2000379IAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

