package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationRank currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IdentificationRankIterator theIdentification = (IdentificationRankIterator)findAncestorWithClass(this, IdentificationRankIterator.class);
			pageContext.getOut().print(theIdentification.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for rank tag ");
		}
		return SKIP_BODY;
	}
}

