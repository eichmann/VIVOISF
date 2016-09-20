package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractERO_0000045Iterator theAbstract = (AbstractERO_0000045Iterator)findAncestorWithClass(this, AbstractERO_0000045Iterator.class);
			pageContext.getOut().print(theAbstract.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

