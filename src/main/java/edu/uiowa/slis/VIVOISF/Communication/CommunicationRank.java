package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationRank currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CommunicationRankIterator theCommunication = (CommunicationRankIterator)findAncestorWithClass(this, CommunicationRankIterator.class);
			pageContext.getOut().print(theCommunication.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for rank tag ");
		}
		return SKIP_BODY;
	}
}

