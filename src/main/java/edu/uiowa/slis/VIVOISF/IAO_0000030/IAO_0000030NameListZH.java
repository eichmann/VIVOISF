package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameListZHIterator theIAO_0000030 = (IAO_0000030NameListZHIterator)findAncestorWithClass(this, IAO_0000030NameListZHIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

