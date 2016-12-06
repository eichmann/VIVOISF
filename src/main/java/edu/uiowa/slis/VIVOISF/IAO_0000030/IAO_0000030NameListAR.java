package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030NameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030NameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030NameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030NameListARIterator theIAO_0000030 = (IAO_0000030NameListARIterator)findAncestorWithClass(this, IAO_0000030NameListARIterator.class);
			pageContext.getOut().print(theIAO_0000030.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

