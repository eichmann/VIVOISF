package edu.uiowa.slis.VIVOISF.Comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommentProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommentProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(CommentProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommentProducerIterator theCommentProducerIterator = (CommentProducerIterator)findAncestorWithClass(this, CommentProducerIterator.class);
			pageContext.getOut().print(theCommentProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Comment for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Comment for producer tag ");
		}
		return SKIP_BODY;
	}
}

