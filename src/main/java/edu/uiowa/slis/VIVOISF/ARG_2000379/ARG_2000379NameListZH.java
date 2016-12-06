package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379NameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379NameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379NameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379NameListZHIterator theARG_2000379 = (ARG_2000379NameListZHIterator)findAncestorWithClass(this, ARG_2000379NameListZHIterator.class);
			pageContext.getOut().print(theARG_2000379.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

