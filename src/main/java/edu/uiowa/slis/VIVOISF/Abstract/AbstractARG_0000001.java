package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractARG_0000001Iterator theAbstract = (AbstractARG_0000001Iterator)findAncestorWithClass(this, AbstractARG_0000001Iterator.class);
			pageContext.getOut().print(theAbstract.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

