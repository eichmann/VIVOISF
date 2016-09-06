package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractRO_0000056Iterator theAbstractRO_0000056Iterator = (AbstractRO_0000056Iterator)findAncestorWithClass(this, AbstractRO_0000056Iterator.class);
			pageContext.getOut().print(theAbstractRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

