package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSourceModified extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSourceModified currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSourceModified.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingSourceModifiedIterator theself_governing = (self_governingSourceModifiedIterator)findAncestorWithClass(this, self_governingSourceModifiedIterator.class);
			pageContext.getOut().print(theself_governing.getSourceModified());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for sourceModified tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for sourceModified tag ");
		}
		return SKIP_BODY;
	}
}

