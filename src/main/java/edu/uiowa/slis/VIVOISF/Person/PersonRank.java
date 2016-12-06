package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRank currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonRankIterator thePerson = (PersonRankIterator)findAncestorWithClass(this, PersonRankIterator.class);
			pageContext.getOut().print(thePerson.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for rank tag ");
		}
		return SKIP_BODY;
	}
}

