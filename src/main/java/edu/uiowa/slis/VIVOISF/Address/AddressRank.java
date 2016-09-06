package edu.uiowa.slis.VIVOISF.Address;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AddressRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AddressRank currentInstance = null;
	private static final Log log = LogFactory.getLog(AddressRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AddressRankIterator theAddress = (AddressRankIterator)findAncestorWithClass(this, AddressRankIterator.class);
			pageContext.getOut().print(theAddress.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Address for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Address for rank tag ");
		}
		return SKIP_BODY;
	}
}

