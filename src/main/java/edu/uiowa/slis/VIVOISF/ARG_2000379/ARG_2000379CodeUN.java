package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379CodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379CodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379CodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379CodeUNIterator theARG_2000379 = (ARG_2000379CodeUNIterator)findAncestorWithClass(this, ARG_2000379CodeUNIterator.class);
			pageContext.getOut().print(theARG_2000379.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

