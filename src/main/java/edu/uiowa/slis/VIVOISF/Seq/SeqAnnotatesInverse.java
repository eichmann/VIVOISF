package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqAnnotatesInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqAnnotatesInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqAnnotatesInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqAnnotatesInverseIterator theSeqAnnotatesInverseIterator = (SeqAnnotatesInverseIterator)findAncestorWithClass(this, SeqAnnotatesInverseIterator.class);
			pageContext.getOut().print(theSeqAnnotatesInverseIterator.getAnnotatesInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for annotates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for annotates tag ");
		}
		return SKIP_BODY;
	}
}

