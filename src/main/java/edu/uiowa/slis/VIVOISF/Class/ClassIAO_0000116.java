package edu.uiowa.slis.VIVOISF.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassIAO_0000116 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClassIAO_0000116 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassIAO_0000116.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassIAO_0000116Iterator theClass = (ClassIAO_0000116Iterator)findAncestorWithClass(this, ClassIAO_0000116Iterator.class);
			pageContext.getOut().print(theClass.getIAO_0000116());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for IAO_0000116 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for IAO_0000116 tag ");
		}
		return SKIP_BODY;
	}
}

