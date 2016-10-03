package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqAuthorListInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqAuthorListInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqAuthorListInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqAuthorListInverseIterator theSeqAuthorListInverseIterator = (SeqAuthorListInverseIterator)findAncestorWithClass(this, SeqAuthorListInverseIterator.class);
			pageContext.getOut().print(theSeqAuthorListInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for authorList tag ");
		}
		return SKIP_BODY;
	}
}

