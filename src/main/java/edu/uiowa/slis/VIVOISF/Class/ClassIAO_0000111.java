package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassIAO_0000111 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassIAO_0000111 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassIAO_0000111.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassIAO_0000111Iterator theClass = (ClassIAO_0000111Iterator)findAncestorWithClass(this, ClassIAO_0000111Iterator.class);
			pageContext.getOut().print(theClass.getIAO_0000111());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for IAO_0000111 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for IAO_0000111 tag ");
		}
		return SKIP_BODY;
	}
}

