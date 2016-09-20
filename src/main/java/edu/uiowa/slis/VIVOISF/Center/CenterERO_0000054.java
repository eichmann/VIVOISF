package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterERO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterERO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterERO_0000054.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CenterERO_0000054Iterator theCenter = (CenterERO_0000054Iterator)findAncestorWithClass(this, CenterERO_0000054Iterator.class);
			pageContext.getOut().print(theCenter.getERO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for ERO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for ERO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

