package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRank currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipRankIterator theEditorship = (EditorshipRankIterator)findAncestorWithClass(this, EditorshipRankIterator.class);
			pageContext.getOut().print(theEditorship.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for rank tag ");
		}
		return SKIP_BODY;
	}
}

