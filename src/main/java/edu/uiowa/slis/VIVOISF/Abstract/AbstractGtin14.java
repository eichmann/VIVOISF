package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractGtin14Iterator theAbstract = (AbstractGtin14Iterator)findAncestorWithClass(this, AbstractGtin14Iterator.class);
			pageContext.getOut().print(theAbstract.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

