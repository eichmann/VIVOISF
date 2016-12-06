package edu.uiowa.slis.VIVOISF.Addressing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressingRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressingRank currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressingRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressingRankIterator theAddressing = (AddressingRankIterator)findAncestorWithClass(this, AddressingRankIterator.class);
			pageContext.getOut().print(theAddressing.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Addressing for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Addressing for rank tag ");
		}
		return SKIP_BODY;
	}
}

