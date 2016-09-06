package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameRank currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FormattedNameRankIterator theFormattedName = (FormattedNameRankIterator)findAncestorWithClass(this, FormattedNameRankIterator.class);
			pageContext.getOut().print(theFormattedName.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for rank tag ");
		}
		return SKIP_BODY;
	}
}

