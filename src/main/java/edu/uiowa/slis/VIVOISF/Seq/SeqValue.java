package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqValue currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeqValueIterator theSeqValueIterator = (SeqValueIterator)findAncestorWithClass(this, SeqValueIterator.class);
			pageContext.getOut().print(theSeqValueIterator.getValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for value tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for value tag ");
		}
		return SKIP_BODY;
	}
}

