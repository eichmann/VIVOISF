package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractLccnIterator theAbstract = (AbstractLccnIterator)findAncestorWithClass(this, AbstractLccnIterator.class);
			pageContext.getOut().print(theAbstract.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for lccn tag ");
		}
		return SKIP_BODY;
	}
}

