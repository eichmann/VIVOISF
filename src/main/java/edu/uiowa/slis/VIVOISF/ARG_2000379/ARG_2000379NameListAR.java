package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379NameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379NameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379NameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379NameListARIterator theARG_2000379 = (ARG_2000379NameListARIterator)findAncestorWithClass(this, ARG_2000379NameListARIterator.class);
			pageContext.getOut().print(theARG_2000379.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

