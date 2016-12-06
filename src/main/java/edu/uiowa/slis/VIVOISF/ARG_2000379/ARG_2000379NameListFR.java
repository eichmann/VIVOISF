package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379NameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379NameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379NameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379NameListFRIterator theARG_2000379 = (ARG_2000379NameListFRIterator)findAncestorWithClass(this, ARG_2000379NameListFRIterator.class);
			pageContext.getOut().print(theARG_2000379.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

