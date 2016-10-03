package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqAnnotatesInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqAnnotatesInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqAnnotatesInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqAnnotatesInverseIterator theSeqAnnotatesInverseIterator = (SeqAnnotatesInverseIterator)findAncestorWithClass(this, SeqAnnotatesInverseIterator.class);
			pageContext.getOut().print(theSeqAnnotatesInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for annotates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for annotates tag ");
		}
		return SKIP_BODY;
	}
}

