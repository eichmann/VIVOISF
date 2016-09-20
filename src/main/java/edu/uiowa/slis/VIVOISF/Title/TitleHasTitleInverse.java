package edu.uiowa.slis.VIVOISF.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleHasTitleInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TitleHasTitleInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleHasTitleInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleHasTitleInverseIterator theTitleHasTitleInverseIterator = (TitleHasTitleInverseIterator)findAncestorWithClass(this, TitleHasTitleInverseIterator.class);
			pageContext.getOut().print(theTitleHasTitleInverseIterator.getHasTitleInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

