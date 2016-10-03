package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqAuthorListInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqAuthorListInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqAuthorListInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqAuthorListInverseIterator theSeqAuthorListInverseIterator = (SeqAuthorListInverseIterator)findAncestorWithClass(this, SeqAuthorListInverseIterator.class);
			pageContext.getOut().print(theSeqAuthorListInverseIterator.getAuthorListInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for authorList tag ");
		}
		return SKIP_BODY;
	}
}

