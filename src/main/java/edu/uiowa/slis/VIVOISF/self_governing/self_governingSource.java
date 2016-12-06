package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingSource extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingSource currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingSource.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingSourceIterator theself_governing = (self_governingSourceIterator)findAncestorWithClass(this, self_governingSourceIterator.class);
			pageContext.getOut().print(theself_governing.getSource());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for source tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for source tag ");
		}
		return SKIP_BODY;
	}
}

